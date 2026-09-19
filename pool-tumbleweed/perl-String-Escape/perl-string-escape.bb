SUMMARY = "Backslash escapes, quoted phrase, word elision, etc."
DESCRIPTION = "sorry, no description found"
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "2010.002"

RPM_NAME = "perl-String-Escape-2010.002-14.43.noarch.rpm"
RPM_HASH = "38b1ba3992c81c1f0ad27aeb4f76a8632b750df4c45d8b9834ee00bac2766015e26abfae183d84d930b28fa403556e453812935d737366849935b16ee83a4fd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-String--Escape \
perl-String-Escape"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
