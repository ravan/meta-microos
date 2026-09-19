SUMMARY = "Open Virtual Machine Firmware - QEMU rom images (x86_64)"
DESCRIPTION = "The Open Virtual Machine Firmware (OVMF) project aims to support \
firmware for Virtual Machines using the edk2 code base. \
 \
This package contains UEFI rom images for exercising UEFI secure \
boot in a qemu environment (x86_64)"
LICENSE = "BSD-2-Clause-Patent"

PV = "202608"

RPM_NAME = "qemu-ovmf-x86_64-202608-2.1.noarch.rpm"
RPM_HASH = "72592a6e50889b92bc4388683148ca10ddbdf719b4bf2f5477825db44f0ec934225b0c4b8352de1bc3b779f3ff554ff485a4f5f3e0bf29ed951bf0b92d9367c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-ovmf-x86-64"

RDEPENDS:${PN} += "qemu"

inherit rpm
