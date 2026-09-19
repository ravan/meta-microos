SUMMARY = "Header files and libraries for compiling against libircclient"
DESCRIPTION = "It is designed to be small, fast, portable and compatible to RFC standards and most IRC clients."
LICENSE = "LGPL-2.0-or-later"

PV = "1.10"

RPM_NAME = "libircclient-devel-1.10-2.9.aarch64.rpm"
RPM_HASH = "5d73944be3c651ca0e6cf6e8b5ff34b68aad61dc1a76974650c8b58c5d640f0fef36fe122283a0828a17146e63f24fb3df57f435ff940d8dbdc876fdc10b240f"

RPROVIDES:${PN} += "libircclient-devel"

RDEPENDS:${PN} += "libircclient1"

inherit rpm
