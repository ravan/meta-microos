SUMMARY = "Debian package related modules"
DESCRIPTION = "This is a collection of modules that are for dealing with Debian related \
data. Currently handled are: \
 \
* Debtags information (debian.debtags module) \
* debian/changelog (debian.changelog module) \
* Packages files, pdiffs (debian.debian_support module) \
* Control files of single or multiple RFC822-style paragraphs, e.g. \
  debian/control, .changes, .dsc, Packages, Sources, Release, etc. \
  (debian.deb822 module) \
* Raw .deb and .ar files, with (read-only) access to contained \
  files and meta-information"
LICENSE = "GPL-3.0-or-later"

PV = "1.0.1"

RPM_NAME = "python313-python-debian-1.0.1-1.5.noarch.rpm"
RPM_HASH = "f6372d9942a6e0e26d0a62135c7b49079e04f9fb5bb7cee21e152c9fd14f0afd72c9eed4f8637bfc0d851fb8257c79fa125ab125c434461b435e07853346e6ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-debian \
python3-python-debian \
python3.13dist-python-debian \
python313-debian \
python313-python-debian \
python3dist-python-debian"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python313-charset-normalizer \
zstd"

inherit rpm
