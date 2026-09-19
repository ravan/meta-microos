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

RPM_NAME = "python314-dfVFS-0~20260411-1.2.noarch.rpm"
RPM_HASH = "98db03d9bb6f40dc683bb25454f390a0a547bd87bd877df5681a93d3439ebe6d10bbe8347ba6c381b395a29ec01690509f3beec0bd650b42dcf4e4b121dc1009"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-dfvfs \
python314-dfVFS \
python3dist-dfvfs"

RDEPENDS:${PN} += "python-abi \
python314-PyYAML \
python314-cffi \
python314-construct \
python314-cryptography \
python314-dfdatetime \
python314-dtfabric \
python314-idna \
python314-libbde \
python314-libcaes \
python314-libewf \
python314-libfsapfs \
python314-libfsext \
python314-libfsfat \
python314-libfshfs \
python314-libfsntfs \
python314-libfsxfs \
python314-libfvde \
python314-libfwnt \
python314-libluksde \
python314-libmodi \
python314-libphdi \
python314-libqcow \
python314-libsigscan \
python314-libsmdev \
python314-libsmraw \
python314-libvhdi \
python314-libvmdk \
python314-libvsapm \
python314-libvsgpt \
python314-libvshadow \
python314-libvslvm \
python314-tsk"

inherit rpm
