SUMMARY = "run faketools in verbose mode"
DESCRIPTION = "prints various notice messages from faketools - useful for debugging \
warning: can confuse some test frameworks"
LICENSE = "MIT"

PV = "0.5.5+0"

RPM_NAME = "reproducible-faketools-verbose-0.5.5+0-1.7.noarch.rpm"
RPM_HASH = "e889a7e124e554bd448e16ca9ba0ccd39f8f4afe6ba408e821c653415c4570fe962780d9f1f36818b8209515cad4801a71175caae283f97e06eb0b30ba5f1e86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "reproducible-faketools-verbose"

RDEPENDS:${PN} += "reproducible-faketools-rpmbuild"

inherit rpm
