SUMMARY = "Extract files from UBI and UBIFS images"
DESCRIPTION = "Collection of Python scripts for reading information about and extracting \
data from UBI and UBIFS images. \
 \
The following tools are included: \
 - ubireader_display_info: \
   Show information about UBI or UBIFS image. \
 - ubireader_extract_files: \
   Extract contents of a UBI or UBIFS image. \
 - ubireader_extract_images: \
   Extract UBI or UBIFS images from file containing UBI data in it. \
 - ubireader_list_files: \
   List and Extract files of a UBI or UBIFS image. \
 - ubireader_utils_info: \
   Determine settings for recreating UBI image."
LICENSE = "LGPL-3.0-or-later"

PV = "0.8.16"

RPM_NAME = "ubi_reader-0.8.16-1.1.noarch.rpm"
RPM_HASH = "62ef14327a5d025b63961da4afea799b88fe885bcce66b89b67a319f27a833cfb596f4e200c4c37db68c3d6fa7275560a207097a583425b3cb46bc376613ef0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-ubi-reader \
python3dist-ubi-reader \
ubi-reader"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python313-cryptography \
python313-lzallright \
python313-zstandard"

inherit rpm
