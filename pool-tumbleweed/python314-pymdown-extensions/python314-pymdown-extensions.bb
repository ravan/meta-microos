SUMMARY = "Extension pack for Python Markdown"
DESCRIPTION = "PyMdown Extensions is a collection of extensions for Python Markdown. \
 \
They were originally written to make writing documentation more enjoyable. \
Covering a wide range of solutions, and while not every extension is needed \
by all people, there is usually at least one useful extension for anybody."
LICENSE = "MIT"

PV = "11.0.2"

RPM_NAME = "python314-pymdown-extensions-11.0.2-1.1.noarch.rpm"
RPM_HASH = "150e00b6ab2447ec60e2212f7097df43a110a3d12dd7bebceca976849256a3da6921eded5d14fae3a1e1c563c5989584e9e73f7e97e04d62bb0adb2519e5021f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pymdown-extensions \
python314-pymdown-extensions \
python3dist-pymdown-extensions"

RDEPENDS:${PN} += "python-abi \
python314-Markdown \
python314-PyYAML"

inherit rpm
