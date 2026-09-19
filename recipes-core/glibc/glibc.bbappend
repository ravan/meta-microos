PROVIDES += "virtual/libc \
	     virtual/libintl \
	     virtual/libiconv"

# MicroOS is usrmerged: /lib and /lib64 are symlinks into /usr, made by the
# filesystem package. do_populate_sysroot turns those symlinks into real
# directories, so put them back before anything links against the sysroot.
SYSROOT_PREPROCESS_FUNCS:append:class-target = " prepare_usrmerge_sysroot"

prepare_usrmerge_sysroot() {
    for l in lib lib64; do
        mkdir -p ${SYSROOT_DESTDIR}${exec_prefix}/$l
        if [ ! -e ${SYSROOT_DESTDIR}${base_prefix}/$l ]; then
            ln -sr ${SYSROOT_DESTDIR}${exec_prefix}/$l ${SYSROOT_DESTDIR}${base_prefix}/$l
        fi
    done
}

# Claim the runtime names poky's own glibc package splits out.
#
# Without this, "ldconfig" resolves to poky's glibc, which RDEPENDS on
# linux-libc-headers-dev. The toolchain mode skips linux-libc-headers because
# MicroOS supplies linux-glibc-devel, so poky's glibc is unbuildable and every
# name that reaches it - ldconfig, python3, dbus, perl - is reported as a
# missing provider. That single wrong answer accounted for 70 of the 91 errors
# an image build printed.
#
# openSUSE ships all of these inside the glibc package itself.
RPROVIDES:${PN} += "ldconfig \
                    glibc-utils \
                    eglibc \
                    libsegfault \
                    nscd"
