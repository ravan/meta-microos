SUMMARY = "Flake8 lint for newline after class definitions"
DESCRIPTION = "Flake8 Extension to lint for a method newline after a Class definition"
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python313-flake8-class-newline-1.6.0-3.5.noarch.rpm"
RPM_HASH = "b281857403e744ccc8a940e838dad00351436d85ede8e0bc4d59e34051cac56de83d77516d6e04ed397d1b1fd31959520a71543fc93e9a54d0a3bb30fb112623"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flake8-class-newline \
python3.13dist-flake8-class-newline \
python313-flake8-class-newline \
python3dist-flake8-class-newline"

RDEPENDS:${PN} += "python-abi \
python313-flake8"

inherit rpm
