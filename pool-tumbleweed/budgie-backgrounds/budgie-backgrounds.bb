SUMMARY = "The default background set for the Budgie Desktop"
DESCRIPTION = "Budgie Backgrounds is the default set of background images for the Budgie Desktop."
LICENSE = "CC0-1.0"

PV = "3.0"

RPM_NAME = "budgie-backgrounds-3.0-2.5.noarch.rpm"
RPM_HASH = "8b41ae38fd9ec50bcfc42215d4eb98babadcf76ee80a3dca3183bffa46308889f18ce3f4612c6d0d843754eed1f80e554be7befae32c770af03d38a17aec9363"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "budgie-backgrounds"

RDEPENDS:${PN} += ""

inherit rpm
