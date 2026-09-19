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

RPM_NAME = "python313-pywinrm-0.5.0-2.9.noarch.rpm"
RPM_HASH = "9c7a3237baa4ee9d57e1929aee37833a71ecadc8d658c4953ac06a25810a0d1e413a164bc3f1bc9153643272638cf58f489e3ca6f419346acaaef626afc06da5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pywinrm \
python3.13dist-pywinrm \
python313-pywinrm \
python3dist-pywinrm"

RDEPENDS:${PN} += "python-abi \
python313-requests \
python313-requests-ntlm \
python313-xmltodict"

inherit rpm
