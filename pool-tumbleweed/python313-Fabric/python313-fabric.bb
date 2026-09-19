SUMMARY = "A Pythonic tool for remote execution and deployment"
DESCRIPTION = "Fabric is a Python library and command-line tool for \
streamlining the use of SSH for application deployment or systems \
administration tasks. \
 \
It provides a basic suite of operations for executing local or remote shell \
commands (normally or via sudo) and uploading/downloading files, as well as \
auxiliary functionality such as prompting the running user for input, or \
aborting execution. \
 \
In addition to being used via the fab tool, Fabric's components may be imported \
into other Python code, providing a Pythonic interface to the SSH protocol \
suite at a higher level than that provided by e.g. Paramiko (which \
Fabric itself leverages)."
LICENSE = "BSD-2-Clause"

PV = "3.2.3"

RPM_NAME = "python313-Fabric-3.2.3-1.2.noarch.rpm"
RPM_HASH = "3179a32995c1401e5689324a0b4129d672bbda240c7a3bf02c73c7e9bce575e8aba9da07ab9f6a27f94370bd48001f437d99ee50b325971d062a03ba25b6ced5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Fabric \
python3-Fabric2 \
python3-Fabric3 \
python3-fabric \
python3-fabric2 \
python3.13dist-fabric \
python313-Fabric \
python313-Fabric2 \
python313-Fabric3 \
python313-fabric \
python313-fabric2 \
python3dist-fabric"

RDEPENDS:${PN} += "-python313-invoke >= 2.0 with python313-invoke < 3.0 \
/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-Deprecated \
python313-decorator \
python313-paramiko"

inherit rpm
