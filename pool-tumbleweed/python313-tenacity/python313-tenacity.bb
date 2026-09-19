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

RPM_NAME = "python313-tenacity-9.1.2-2.4.noarch.rpm"
RPM_HASH = "679ab2d449c778c627fdf9e4b61e88c514ba76db864653de1ffc66b8905ef11d4637ce57f34ea421794626d738b78b52e149164dc0ade02e82629cc4d44e1873"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tenacity \
python3.13dist-tenacity \
python313-tenacity \
python3dist-tenacity"

RDEPENDS:${PN} += "python-abi"

inherit rpm
