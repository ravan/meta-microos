SUMMARY = "Free Chinese-English Dictionary in EDICT Format"
DESCRIPTION = "This is a free Chinese-English dictionary that can be used, for \
example, with Gjiten. \
 \
The objective of the CEDICT project is to create an online, \
downloadable (as opposed to searchable-only) public-domain \
Chinese-English dictionary. For the most part, the project is modelled \
on Jim Breen's highly successful EDICT (Japanese-English dictionary) \
project and is intended to be a collaborative effort with users \
providing entries and corrections to the main file."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0+"

PV = "20141224"

RPM_NAME = "cedict-20141224-1.24.noarch.rpm"
RPM_HASH = "8f2eb3cea087929bd5f8c223df30b95f95b1c98c6f334fdb7319533bb6d215326ae74e505494299f791422e6f22bc03a65d6cca4f53d441fe961a54514d5eb24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cedict \
locale-gjiten-zh"

RDEPENDS:${PN} += ""

inherit rpm
