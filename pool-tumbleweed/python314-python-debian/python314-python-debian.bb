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

RPM_NAME = "python314-python-debian-1.0.1-1.5.noarch.rpm"
RPM_HASH = "824ca535e76cdebd77db024e61d0b2e91c438436cfec55233eff5513acbcbdc973819cc009ebb4b51e01933736ac08b8622b5e06f02bd6140468e9cfad36fdce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-debian \
python314-debian \
python314-python-debian \
python3dist-python-debian"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python314-charset-normalizer \
zstd"

inherit rpm
