SUMMARY = "SUSE signed Microsoft KEK package for OVMF"
DESCRIPTION = "SUSE signed Microsoft KEK package for OVMF. The KEKUpdate_SUSE_PK.auth file \
can be used to update kek in SUSE ovmf by efi-updatevar tool."
LICENSE = "BSD-2-Clause-Patent"

PV = "1.6.5"

RPM_NAME = "ovmf-KEKUpdate-1.6.5-2.1.aarch64.rpm"
RPM_HASH = "208381c4afdb11e4095df89faaab1b88ef5ffe3771ab86a3ea7947c0b79946efdad86c02fee7bbdcf578883f5e986ed05461e89a82d639fdf8485a60974e0b4f"

RPROVIDES:${PN} += "ovmf-KEKUpdate"

RDEPENDS:${PN} += ""

inherit rpm
