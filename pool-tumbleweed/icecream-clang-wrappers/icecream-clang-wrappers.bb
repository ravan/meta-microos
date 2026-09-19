SUMMARY = "Distributed Compile Wrappers for Clang"
DESCRIPTION = "Wrapper symlinks for clang/clang++ for icecream distributed building."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.4.0"

RPM_NAME = "icecream-clang-wrappers-1.4.0-4.6.aarch64.rpm"
RPM_HASH = "055204e68c96e7f92262b3867c12a77258b15b50746cf79ee80f9475a849c3ed8f2383ca48fafafc3764c956a7ddec381c03697739e02ef294802329df2416b8"

RPROVIDES:${PN} += "icecream-clang-wrappers"

RDEPENDS:${PN} += "clang \
icecream"

inherit rpm
