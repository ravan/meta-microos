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

RPM_NAME = "python314-nornir-3.5.0-2.4.noarch.rpm"
RPM_HASH = "e83ee21f2a6bef339a109564065a28b94fdbb0a14e8b0140f410bb889572114574701932f2064048d4c68c2c628474f81d1bd83863d89256558bef08fbc47889"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-nornir \
python314-nornir \
python3dist-nornir"

RDEPENDS:${PN} += "python-abi \
python314-ruamel.yaml"

inherit rpm
