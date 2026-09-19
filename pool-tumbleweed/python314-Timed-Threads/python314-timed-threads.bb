SUMMARY = "Absolute time deadlines and thread cancelling for Python asynchronous threads"
DESCRIPTION = "A python module that adds the ability to set relative elapsed time deadlines on \
asynchronous threads, and allows one thread to stop another by means of raising \
an exception. \
 \
The main motivation of this module is to support TimedConstraint in the \
open-source implementation of Mathematica, called Mathics3."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python314-Timed-Threads-2.0.0-1.2.noarch.rpm"
RPM_HASH = "9599769050a3f7deb78a24b5bfc937794e030d2566ed1b1436f51ca9513ffdaf58e3887c0a1358b0f7fa437c16dfecce8b6ef59d0f320ed6863a86e8010c169b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-timed-threads \
python314-Timed-Threads \
python3dist-timed-threads"

RDEPENDS:${PN} += "python-abi"

inherit rpm
