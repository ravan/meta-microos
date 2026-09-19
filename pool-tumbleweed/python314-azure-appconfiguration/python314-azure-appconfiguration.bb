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

RPM_NAME = "python314-azure-appconfiguration-1.9.0-1.2.noarch.rpm"
RPM_HASH = "5dfd8ee7f5c3a0f0b2be4189fba0147848d6789aad1a9dcfe96efad0e31fd3231147ad5a1ed6e5f31a6d7005bf49499d440e355141b6af1ccc7b72c097141765"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-appconfiguration \
python314-azure-appconfiguration \
python3dist-azure-appconfiguration"

RDEPENDS:${PN} += "-python314-azure-core >= 1.37.0 with python314-azure-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
