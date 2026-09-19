# The openSUSE gcc13 RPM holds two very different kinds of file in
# /usr/lib64/gcc/aarch64-suse-linux/13:
#
#   - link-time data: crtbegin.o, crtend.o, libgcc.a, libgcc_s.so
#   - aarch64 programs: collect2, lto-wrapper, cc1
#
# Our cross compiler needs the first kind and must never see the second. Pointing
# gcc at the directory with -B makes it search there for programs too, and it
# then tries to run the aarch64 collect2 on an x86_64 host:
#
#   fatal error: cannot execute '.../13/collect2': execv: Exec format error
#
# So copy just the link-time data into a directory of its own, and let
# tcmode-microos-sysroot.inc aim -B at that instead.

MICROOS_STARTFILE_DIR ?= "${libdir}/microos-startfiles"

SYSROOT_PREPROCESS_FUNCS:append:microos-sysroot = " microos_stage_startfiles"

microos_stage_startfiles() {
    src="${SYSROOT_DESTDIR}${libdir}/gcc/${TARGET_SYS}/${MICROOS_GCC_MAJOR}"
    dst="${SYSROOT_DESTDIR}${MICROOS_STARTFILE_DIR}"
    install -d "$dst"
    for f in "$src"/*.o "$src"/libgcc*; do
        if [ -e "$f" ]; then
            cp -a "$f" "$dst"/
        fi
    done
}
