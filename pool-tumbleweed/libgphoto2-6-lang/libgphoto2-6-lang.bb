SUMMARY = "Translations for package libgphoto2-6"
DESCRIPTION = "Provides translations for the 'libgphoto2-6' package."
LICENSE = "LGPL-2.1-or-later"

PV = "2.5.34"

RPM_NAME = "libgphoto2-6-lang-2.5.34-1.3.noarch.rpm"
RPM_HASH = "53576f9f86674869e936630de5a5a6cb8dc14e36f7ffbc8fe722acc4168a9963b04e51bbb61d1772f84eae473ac770d564e49e2a0cb5c95bcad48d56fc54e278"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libgphoto2-6-lang \
libgphoto2-6-lang-all \
locale-libgphoto2-6-ar \
locale-libgphoto2-6-cs \
locale-libgphoto2-6-da \
locale-libgphoto2-6-de \
locale-libgphoto2-6-es \
locale-libgphoto2-6-eu \
locale-libgphoto2-6-fi \
locale-libgphoto2-6-fr \
locale-libgphoto2-6-fur \
locale-libgphoto2-6-hu \
locale-libgphoto2-6-it \
locale-libgphoto2-6-ja \
locale-libgphoto2-6-ka \
locale-libgphoto2-6-nl \
locale-libgphoto2-6-pl \
locale-libgphoto2-6-pt-BR \
locale-libgphoto2-6-ro \
locale-libgphoto2-6-ru \
locale-libgphoto2-6-sk \
locale-libgphoto2-6-sr \
locale-libgphoto2-6-sv \
locale-libgphoto2-6-uk \
locale-libgphoto2-6-vi \
locale-libgphoto2-6-zh-CN \
locale-libgphoto2-6-zh-TW"

RDEPENDS:${PN} += "libgphoto2-6"

inherit rpm
