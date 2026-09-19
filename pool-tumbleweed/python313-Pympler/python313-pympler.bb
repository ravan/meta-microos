SUMMARY = "A tool to analyze the memory behavior of Python objects"
DESCRIPTION = "Pympler is a development tool to measure, monitor and analyze the \
memory behavior of Python objects in a running Python application. \
 \
By pympling a Python application, detailed insight in the size and \
the lifetime of Python objects can be obtained.  Undesirable or \
unexpected runtime behavior like memory bloat and other 'pymples' \
can easily be identified."
LICENSE = "Apache-2.0"

PV = "1.1"

RPM_NAME = "python313-Pympler-1.1-6.4.noarch.rpm"
RPM_HASH = "c0478cd2b38d0cfb72a99934efcc921c6c110e89da80099cecd7001b4090fc957eeac045c7d783e77941532771214bd3acfb6c41e35d816cefbe9cc10942c303"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Pympler \
python3.13dist-pympler \
python313-Pympler \
python3dist-pympler"

RDEPENDS:${PN} += "python-abi \
python313-tk"

inherit rpm
