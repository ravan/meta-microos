SUMMARY = "Network automation framework written in Python"
DESCRIPTION = "Nornir is a pure Python network automation framework intented to be used \
directly from Python. \
While most automation frameworks use their own Domain Specific Language (DSL) \
which you use to describe what you want to have done, Nornir lets you control \
everything from Python. \
What Nornir brings to the table is that it takes care of dealing with your \
inventory and manages the job of dispatching the tasks you want to run against \
your nodes and devices. The framework provides a very simple way to write \
plugins if you aren't happy with the ones we ship."
LICENSE = "Apache-2.0"

PV = "3.5.0"

RPM_NAME = "python313-nornir-3.5.0-2.4.noarch.rpm"
RPM_HASH = "dde7dfae62fa462ed96f28bc24f197b87f273c163274438b85cf8e572a01f27c9d8aa89b8ef8509ecb6bc4570ccd5cf20cc9dd767f363756c62ad77baed6c227"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nornir \
python3.13dist-nornir \
python313-nornir \
python3dist-nornir"

RDEPENDS:${PN} += "python-abi \
python313-ruamel.yaml"

inherit rpm
