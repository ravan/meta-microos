SUMMARY = "Adapt generators and other iterables to a file-like interface"
DESCRIPTION = "Adapt generators and other iterables to a file-like interface"
LICENSE = "LGPL-3.0-only"

PV = "1.0.1"

RPM_NAME = "python314-iterable-io-1.0.1-1.3.noarch.rpm"
RPM_HASH = "180bce4379597b5de3c6f6e7a6339af56193709c6c555e4bbecd70f0c324e8c3509f88233ed67eb643ecde7ff88e40cf6e06aca72ddcee422cd5231fb43bec98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-iterable-io \
python314-iterable-io \
python3dist-iterable-io"

RDEPENDS:${PN} += "python-abi"

inherit rpm
