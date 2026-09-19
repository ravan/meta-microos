SUMMARY = "Data files for the libcangjie IME"
DESCRIPTION = "libcangjie is a C library implementing the Cangjie input method, \
which is mainly used on Traditional Chinese inputing. \
 \
libcangjie-data contains the input mapping table to switch en_US \
keyboard codes to Traditional Chinese characters, and it is designed \
to be compiled into the final input engine 'ibus-cangjie'."
LICENSE = "LGPL-3.0+"

PV = "1.3"

RPM_NAME = "libcangjie-data-1.3-1.33.noarch.rpm"
RPM_HASH = "533f4a9828e96293cabbed23f9cfc8432b17a18ac05c40d6f6d9a5919430341fdf087162b7c4d4838f0d8872b83ea2f2bc51aabeda89f1d5889bc6be343f2785"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libcangjie-data"

RDEPENDS:${PN} += "libcangjie2"

inherit rpm
