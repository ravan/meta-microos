SUMMARY = "Azure Storage File Share client library for Python"
DESCRIPTION = "Azure File Share storage offers fully managed file shares in the cloud that are accessible via \
the industry standard [Server Message Block (SMB) protocol](https://docs.microsoft.com/windows/ \
desktop/FileIO/microsoft-smb-protocol-and-cifs-protocol-overview). Azure file shares can be mounted \
concurrently by cloud or on-premises deployments of Windows, Linux, and macOS. Additionally, \
Azure file shares can be cached on Windows Servers with Azure File Sync for fast access near \
where the data is being used. \
 \
Azure file shares can be used to: \
 \
 * Replace or supplement on-premises file servers \
 * 'Lift and shift' applications \
 * Simplify cloud development with shared application settings, \
   diagnostic share, and Dev/Test/Debug tools"
LICENSE = "MIT"

PV = "12.26.0"

RPM_NAME = "python313-azure-storage-file-share-12.26.0-1.2.noarch.rpm"
RPM_HASH = "04fa084bb9701f4aefab67fa60c55d68ed8e97ec50dbfdb904de92d219d943d678f396dce9e1b431cb598c60dedab0131b4e41e3df293666b486464142381691"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-storage-file-share \
python3.13dist-azure-storage-file-share \
python313-azure-storage-file-share \
python3dist-azure-storage-file-share"

RDEPENDS:${PN} += "-python313-azure-core >= 1.30.0 with python313-azure-core < 2.0.0 \
python-abi \
python313-azure-nspkg \
python313-azure-storage-nspkg \
python313-cryptography \
python313-isodate \
python313-typing-extensions"

inherit rpm
