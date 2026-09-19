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

RPM_NAME = "python314-azure-storage-file-share-12.26.0-1.2.noarch.rpm"
RPM_HASH = "868329464c62099e4d25024b6269d953613bb87717ac84d2ebe478929715c13f5d33c2e4c6bf9c56809f87f317d6596107b764cd7b82285e433395443f53c28b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-storage-file-share \
python314-azure-storage-file-share \
python3dist-azure-storage-file-share"

RDEPENDS:${PN} += "-python314-azure-core >= 1.30.0 with python314-azure-core < 2.0.0 \
python-abi \
python314-azure-nspkg \
python314-azure-storage-nspkg \
python314-cryptography \
python314-isodate \
python314-typing-extensions"

inherit rpm
