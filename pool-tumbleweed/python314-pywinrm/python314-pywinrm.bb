SUMMARY = "Python library for Windows Remote Management"
DESCRIPTION = "pywinrm is a Python client for Windows Remote Management (WinRM). This \
allows you to invoke commands on target Windows machines from any \
machine that can run Python. \
 \
WinRM allows you to call native objects in Windows. This includes, but \
is not limited to, running batch scripts, powershell scripts and \
fetching WMI variables. For more information on WinRM, please visit \
Microsoft's WinRM http://msdn.microsoft.com/en-us/library/aa384426.aspx"
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python314-pywinrm-0.5.0-2.9.noarch.rpm"
RPM_HASH = "4a0246c80a6f0ac26544ea2720e9fedf0e8ae9415b0b48b2b513248f409aa227e925d126189197a9daa15c3fcfc3cef4b5ff9386fd4f62cb0b897e50a17c2102"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pywinrm \
python314-pywinrm \
python3dist-pywinrm"

RDEPENDS:${PN} += "python-abi \
python314-requests \
python314-requests-ntlm \
python314-xmltodict"

inherit rpm
