SUMMARY = "A British words dictionary"
DESCRIPTION = "This package contains a British words dictionary which will be installed as \
 \
/usr/share/dict/british \
 \
For a description see the package words."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "2026.02.25"

RPM_NAME = "words-british-2026.02.25-1.1.noarch.rpm"
RPM_HASH = "7199fa4998324433fe6870e140d8145ef6c8a7e0db843010e10142e5b186833c51c05c73d398a59882f51489edf787ecb2b16a2b33b30b7799309cb96ffc8a88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "words-british"

RDEPENDS:${PN} += "words"

inherit rpm
