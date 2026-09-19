SUMMARY = "Development files for libctranslate2"
DESCRIPTION = "Development files for libctranslate2 like cmake and header files."
LICENSE = "MIT"

PV = "4.6.0"

RPM_NAME = "ctranslate2-devel-4.6.0-2.5.aarch64.rpm"
RPM_HASH = "24b633273c62431697a4becd209c2d49215fb42d17ab846649a284d24581ee05c66f88964fbea2ce388ee79877923aaa7652b02a286718340a4560bf5e6d9021"

RPROVIDES:${PN} += "cmake-ctranslate2 \
ctranslate2-devel"

RDEPENDS:${PN} += "libctranslate2-4"

inherit rpm
