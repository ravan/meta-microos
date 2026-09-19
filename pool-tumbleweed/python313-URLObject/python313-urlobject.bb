SUMMARY = "Python library for manipulating URLs (and some URIs) in a more natural way"
DESCRIPTION = "URLObject is a utility class for manipulating URLs. The latest incarnation of \
this library builds upon the ideas of its predecessor, but aims for a clearer \
API, focusing on proper method names over operator overrides. It's also being \
developed from the ground up in a test-driven manner, and has full Sphinx \
documentation."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "3.0.0"

RPM_NAME = "python313-URLObject-3.0.0-1.1.noarch.rpm"
RPM_HASH = "8079320e062abc475598ef1073f09cf8e99def35bebc56eaf430804840c7172d686f969db9d3c146f38ef2de0a8ef4af0c36c7d1738dafad9fb6c25a3a87ef68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-URLObject \
python3.13dist-urlobject \
python313-URLObject \
python3dist-urlobject"

RDEPENDS:${PN} += "python-abi"

inherit rpm
