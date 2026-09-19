SUMMARY = "Composable style cycles"
DESCRIPTION = "When plotting more than one line it is common to want to be able to \
cycle over one or more artist styles. For simple cases than can be \
done with out too much trouble. \
 \
However, if you want to do something more complicated, the plotting \
logic can quickly become very involved. To address this and allow \
easy cycling over arbitrary kwargs the Cycler class, a composable \
kwarg iterator, was developed."
LICENSE = "BSD-3-Clause"

PV = "0.12.1"

RPM_NAME = "python314-Cycler-0.12.1-1.12.noarch.rpm"
RPM_HASH = "8a1be2269f610b09b7c04a37105b6bcff83ff01b7bdcde7a0e5ff5a05ffa6366c28d8bdbac96681e588f928e693616b9fe7bf0ec39c7d7bbf36b4fda0c299e21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-cycler \
python314-Cycler \
python3dist-cycler"

RDEPENDS:${PN} += "python-abi"

inherit rpm
