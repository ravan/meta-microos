SUMMARY = "Microsoft App Configuration Data Library for Python"
DESCRIPTION = "Azure App Configuration is a managed service that helps developers centralize \
their application configurations simply and securely. \
 \
Modern programs, especially programs running in a cloud, generally have many \
components that are distributed in nature. Spreading configuration settings \
across these components can lead to hard-to-troubleshoot errors during an \
application deployment. Use App Configuration to securely store all the \
settings for your application in one place."
LICENSE = "MIT"

PV = "1.9.0"

RPM_NAME = "python313-azure-appconfiguration-1.9.0-1.2.noarch.rpm"
RPM_HASH = "4752354a1d13c1c6619ccc3243d71d3be5ace692326571e499dd3323962eaa35d35191e8a6c3967c5491f09628bc2d6382228343c8c155dbe100b196bd30f7f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-appconfiguration \
python3.13dist-azure-appconfiguration \
python313-azure-appconfiguration \
python3dist-azure-appconfiguration"

RDEPENDS:${PN} += "-python313-azure-core >= 1.37.0 with python313-azure-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
