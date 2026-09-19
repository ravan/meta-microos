SUMMARY = "Digital Forensics Virtual File System"
DESCRIPTION = "dfVFS, or Digital Forensics Virtual File System, provides read-only \
access to file-system objects from various storage media types and file \
formats. The goal of dfVFS is to provide a generic interface for \
accessing file-system objects, for which it uses several back-ends that \
provide the actual implementation of the various storage media types, \
volume systems and file systems. \
 \
dfVFS originates from the Plaso project and is also based on ideas from \
the GRR project. It was largely rewritten and made into a stand-alone \
project to provide more flexibility and allow other projects to make use \
of the VFS functionality. dfVFS originally was named PyVFS, but that \
name conflicted with another project. \
 \
dfVFS is currently implemented as a Python module."
LICENSE = "Apache-2.0"

PV = "0~20260411"

RPM_NAME = "python313-dfVFS-0~20260411-1.2.noarch.rpm"
RPM_HASH = "d6104f9f18b254ffce118ed2b7a3e85cbe109cd75e2058e2bc0426a290f9f1cb6402da36265b710f044b90f0b2bba9a763909300bb1fc87c380b3de5f578992e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dfVFS \
python3.13dist-dfvfs \
python313-dfVFS \
python3dist-dfvfs"

RDEPENDS:${PN} += "python-abi \
python313-PyYAML \
python313-cffi \
python313-construct \
python313-cryptography \
python313-dfdatetime \
python313-dtfabric \
python313-idna \
python313-libbde \
python313-libcaes \
python313-libewf \
python313-libfsapfs \
python313-libfsext \
python313-libfsfat \
python313-libfshfs \
python313-libfsntfs \
python313-libfsxfs \
python313-libfvde \
python313-libfwnt \
python313-libluksde \
python313-libmodi \
python313-libphdi \
python313-libqcow \
python313-libsigscan \
python313-libsmdev \
python313-libsmraw \
python313-libvhdi \
python313-libvmdk \
python313-libvsapm \
python313-libvsgpt \
python313-libvshadow \
python313-libvslvm \
python313-tsk"

inherit rpm
