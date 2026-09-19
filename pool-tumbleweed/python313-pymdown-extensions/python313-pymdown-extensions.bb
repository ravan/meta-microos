SUMMARY = "Extension pack for Python Markdown"
DESCRIPTION = "PyMdown Extensions is a collection of extensions for Python Markdown. \
 \
They were originally written to make writing documentation more enjoyable. \
Covering a wide range of solutions, and while not every extension is needed \
by all people, there is usually at least one useful extension for anybody."
LICENSE = "MIT"

PV = "11.0.2"

RPM_NAME = "python313-pymdown-extensions-11.0.2-1.1.noarch.rpm"
RPM_HASH = "b6e867326ce3e0165c241655c398f97f2d8154729baf633a5fc83aed7e3c07f9a9292ccbfd3c27cd9e1c4c73f8cb81667da13881eaa198a67cb257d84bb7c742"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pymdown-extensions \
python3.13dist-pymdown-extensions \
python313-pymdown-extensions \
python3dist-pymdown-extensions"

RDEPENDS:${PN} += "python-abi \
python313-Markdown \
python313-PyYAML"

inherit rpm
