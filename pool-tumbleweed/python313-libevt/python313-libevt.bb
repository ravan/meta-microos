SUMMARY = "Library and tools to access the Windows Event Log (EVT) format"
DESCRIPTION = "libevt is a library and tools to access the Windows Event Log \
(EVT) format. \
For the Windows XML Event Log (EVTX) format, see libevtx."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20260705"

RPM_NAME = "python313-libevt-20260705-1.2.aarch64.rpm"
RPM_HASH = "a45d7c1bc1d73ad2b145777c9db16f2c3f740ce16868b6c22444d7c524de853b8f91141c1f30c450e5e0c2bd3ba6eb07be5e1ced84355e0f72fa9318a385d0dd"

RPROVIDES:${PN} += "python3-libevt \
python313-libevt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libevt.so.1 \
python-abi"

inherit rpm
