SUMMARY = "RFC-compliant FQDN validation and manipulation for Python"
DESCRIPTION = "This package validates Fully Qualified Domain Names (FQDNs) conforming to the \
Internet Engineering Task Force specification . The design intent is to \
validate that a string would be traditionally acceptable as a public Internet \
hostname to RFC-conforming software, which is a strict subset of the logic in \
modern web browsers like Mozilla Firefox and Chromium that determines whether \
make a DNS lookup. Configuration options can relax constraints so that short \
hostnames without periods or others with underscores will be valid. These \
relaxations are closer to how modern web browsers work."
LICENSE = "MPL-2.0"

PV = "1.5.1"

RPM_NAME = "python314-fqdn-1.5.1-3.12.noarch.rpm"
RPM_HASH = "59104b13889da87f666f18657e0484961d6c025e59041d16521e3d075cacf354f216109a390dbf90ffb687bc27e8bcdeb2d9c9559bc0c858fd597b7bacb060fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-fqdn \
python314-fqdn \
python3dist-fqdn"

RDEPENDS:${PN} += "python-abi"

inherit rpm
