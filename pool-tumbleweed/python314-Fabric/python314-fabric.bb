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

RPM_NAME = "python314-Fabric-3.2.3-1.2.noarch.rpm"
RPM_HASH = "19c5ea2f1bad07b48bd7ae34e8eab716fe22910f871740848942b76996f5c9d11c84a19e07a82db5bdba39a17236d7d972f8e008b99f054f9cec73711783a72a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-fabric \
python314-Fabric \
python314-Fabric2 \
python314-Fabric3 \
python314-fabric \
python314-fabric2 \
python3dist-fabric"

RDEPENDS:${PN} += "-python314-invoke >= 2.0 with python314-invoke < 3.0 \
/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-Deprecated \
python314-decorator \
python314-paramiko"

inherit rpm
