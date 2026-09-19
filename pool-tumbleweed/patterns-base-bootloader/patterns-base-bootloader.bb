SUMMARY = "Bootloader"
DESCRIPTION = "This pattern holds files required for booting the system"
LICENSE = "MIT"

PV = "20241218"

RPM_NAME = "patterns-base-bootloader-20241218-34.1.aarch64.rpm"
RPM_HASH = "05bfff0e9332366fe9c879dd03cb54676358a202fdd96b00731f5c54a25a3658ec21cea22520df6390f1b94268e4ce3dccee6490dffc6a2f0d79ed5f16036bf5"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
patterns-base-bootloader"

RDEPENDS:${PN} += "grub2 \
grub2-arm64-efi \
mokutil \
shim"

inherit rpm
