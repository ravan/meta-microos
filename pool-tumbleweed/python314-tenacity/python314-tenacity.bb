SUMMARY = "Python module for retrying code until it succeeeds"
DESCRIPTION = "Tenacity is a general-purpose retrying library, written in Python, to simplify \
the task of adding retry behavior to just about anything. \
It originates from a fork of `Retrying`_ \
Features \
-------- \
- Generic Decorator API \
- Specify stop condition (i.e. limit by number of attempts) \
- Specify wait condition (i.e. exponential backoff sleeping between attempts) \
- Customize retrying on Exceptions \
- Customize retrying on expected returned result"
LICENSE = "Apache-2.0"

PV = "9.1.2"

RPM_NAME = "python314-tenacity-9.1.2-2.4.noarch.rpm"
RPM_HASH = "a2f0c85090d00a4beec9d8d33a8ff841e7907a4812425ea951f3308991acfbcb6fc82877fd6532149e6ce849074d6a8511b6b90722d3d772df66723b4fca249e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-tenacity \
python314-tenacity \
python3dist-tenacity"

RDEPENDS:${PN} += "python-abi"

inherit rpm
