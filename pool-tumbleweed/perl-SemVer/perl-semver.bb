SUMMARY = "Use semantic version numbers"
DESCRIPTION = "Use semantic version numbers"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.10.0"

RPM_NAME = "perl-SemVer-0.10.0-1.18.noarch.rpm"
RPM_HASH = "44bf572900ed37b10b295733517a384d24bea0bbf3690be0ff822c3a1c319bcab925801b7eb93ec0c78be4f0eeab3c77bf6967b84cf9317e02da3e9859c84fbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-SemVer"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-version"

inherit rpm
