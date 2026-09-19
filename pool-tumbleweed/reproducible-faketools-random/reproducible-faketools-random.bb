SUMMARY = "reduce sources of explicit randomness"
DESCRIPTION = "reduce sources of explicit randomness \
by replacing /dev/random and urandom"
LICENSE = "MIT"

PV = "0.5.5+0"

RPM_NAME = "reproducible-faketools-random-0.5.5+0-1.7.noarch.rpm"
RPM_HASH = "dfd93ae289ff2f663692e49e4764e69ff9dc117890659ff1db0bf9849819bf15f8094309201b986bb93ad161e39dcb281e07ef420c5967e311b0aaeace2585f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "reproducible-faketools-random"

RDEPENDS:${PN} += "/usr/bin/sh \
reproducible-faketools"

inherit rpm
