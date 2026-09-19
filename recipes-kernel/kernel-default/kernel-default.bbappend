PROVIDES += "virtual/kernel"

# Put the kernel where an image build and runqemu look for it.
#
# The recipe is a passthrough: rpm.bbclass unpacks openSUSE's own kernel RPM and
# never compiles anything, so none of kernel.bbclass's deploy machinery runs and
# DEPLOY_DIR_IMAGE stays empty. openSUSE keeps the kernel inside the modules
# directory rather than /boot, so the file to publish is
# /usr/lib/modules/<release>/Image.
#
# The file is copied byte for byte. It is the image SUSE built and signed, and
# `cmp` against the one fetched from download.opensuse.org is the check that
# says so.
inherit deploy

do_deploy () {
    for image in ${D}${nonarch_base_libdir}/modules/*/${KERNEL_IMAGETYPE}; do
        [ -f "$image" ] || continue
        release=$(basename $(dirname $image))
        install -d ${DEPLOYDIR}
        install -m 0644 $image ${DEPLOYDIR}/${KERNEL_IMAGETYPE}-$release
        ln -sf ${KERNEL_IMAGETYPE}-$release ${DEPLOYDIR}/${KERNEL_IMAGETYPE}
        ln -sf ${KERNEL_IMAGETYPE}-$release ${DEPLOYDIR}/${KERNEL_IMAGETYPE}-${MACHINE}.bin
        bbnote "deployed openSUSE kernel $release as ${KERNEL_IMAGETYPE}"
    done
}

addtask deploy after do_install before do_build
