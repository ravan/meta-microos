SUMMARY = "Documentation files for python-jaraco.stream"
DESCRIPTION = "This package contains documentation files for python-jaraco.stream."
LICENSE = "MIT"

PV = "3.0.4"

RPM_NAME = "python-jaraco.stream-doc-3.0.4-2.5.noarch.rpm"
RPM_HASH = "82dfa239c8810b33196aa92bfcc75617ed04eb8c79b8c67c24e2690eb24d645b5215107f5df43f54209db064ceb0727a7ef0e1476b99ba427c3b8c70fba8964b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-jaraco.stream-doc \
python313-jaraco.stream-doc \
python314-jaraco.stream-doc"

RDEPENDS:${PN} += ""

inherit rpm
