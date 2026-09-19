SUMMARY = "Absolute time deadlines and thread cancelling for Python asynchronous threads"
DESCRIPTION = "A python module that adds the ability to set relative elapsed time deadlines on \
asynchronous threads, and allows one thread to stop another by means of raising \
an exception. \
 \
The main motivation of this module is to support TimedConstraint in the \
open-source implementation of Mathematica, called Mathics3."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python313-Timed-Threads-2.0.0-1.2.noarch.rpm"
RPM_HASH = "5b3be624dfd8acac3e3c44514bf0d5b30b14781d6f18b799173d2c20aa33a4b13869027acc2ab63734e82f2f35390c95fc2112599d54e61e4a341a6927a95ec2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Timed-Threads \
python3.13dist-timed-threads \
python313-Timed-Threads \
python3dist-timed-threads"

RDEPENDS:${PN} += "python-abi"

inherit rpm
