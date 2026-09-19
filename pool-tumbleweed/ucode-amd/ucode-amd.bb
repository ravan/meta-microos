SUMMARY = "Kernel firmware files for Microcode updates for AMD CPUs"
DESCRIPTION = "This package contains kernel firmware files for Microcode updates for AMD CPUs."
LICENSE = "GPL-2.0-or-later & SUSE-Firmware"

PV = "20260610"

RPM_NAME = "ucode-amd-20260610-2.1.noarch.rpm"
RPM_HASH = "a811c1e72adab32683b5ba1e1f07a232aa1675be90d1590d42fccefef2556c19bc4b0dd88a70fdad19e29b236711269845ca849bda37a3eddb00852d61613d30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-amd-ucode/microcode-amd-fam15h.bin \
firmware-amd-ucode/microcode-amd-fam16h.bin \
firmware-amd-ucode/microcode-amd-fam17h.bin \
firmware-amd-ucode/microcode-amd-fam19h.bin \
firmware-amd-ucode/microcode-amd-fam1ah.bin \
firmware-amd-ucode/microcode-amd.bin \
ucode-amd"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
dracut"

inherit rpm
