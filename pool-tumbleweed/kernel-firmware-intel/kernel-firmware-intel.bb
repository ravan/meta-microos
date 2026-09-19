SUMMARY = "Kernel firmware files for Intel-platform device drivers"
DESCRIPTION = "This package contains kernel firmware files for Intel-platform device drivers."
LICENSE = "GPL-2.0-or-later & SUSE-Firmware & GPL-2.0-only"

PV = "20260728"

RPM_NAME = "kernel-firmware-intel-20260728-1.1.noarch.rpm"
RPM_HASH = "2f2db92de22aed1606bf30282cccffb216e81cb48ded675c3169fe29a9d9ad5e56785f6360d279152348cce411eb61c05ba77da7d7bc6fbb84f9783b537585b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-HP/ish/ish-lnlm-12128606-f9751b71.bin \
firmware-HP/ish/ish-ptl-12128606-581.7779.0.bin \
firmware-LENOVO/ish/ish-lnlm-lenovo-X1-2025-5.8.4.7720.bin \
firmware-LENOVO/ish/ish-lnlm-lenovo-X9-14-2025-5.8.36.09092.bin \
firmware-LENOVO/ish/ish-lnlm-lenovo-x9-15-2025-5.8.0.7720.bin \
firmware-LENOVO/ish/ish-ptl-lenovo-X1-2026-5.8.1.7782.bin \
firmware-dell/ish/ish-lnlm-39ceeaf8-58.7727.0.bin \
firmware-dell/ish/ish-ptl-39ceeaf8-581.7779.0.bin \
firmware-dell/ish/ish-ptl-39ceeaf8-581.7783.0.bin \
firmware-hfi1-dc8051.fw \
firmware-hfi1-fabric.fw \
firmware-hfi1-pcie.fw \
firmware-hfi1-sbus.fw \
firmware-intel/ipu/ipu6-fw.bin \
firmware-intel/ipu/ipu6ep-fw.bin \
firmware-intel/ipu/ipu6epadln-fw.bin \
firmware-intel/ipu/ipu6epmtl-fw.bin \
firmware-intel/ipu/ipu6se-fw.bin \
firmware-intel/ipu/ipu7-fw.bin \
firmware-intel/ipu/ipu7ptl-fw.bin \
firmware-intel/ipu/irci-irci-ecr-master-20161208-0213-20170112-1500.bin \
firmware-intel/ipu/shisp-2400b0-v21.bin \
firmware-intel/ipu/shisp-2401a0-v21.bin \
firmware-intel/ipu3-fw.bin \
firmware-intel/irci-irci-ecr-master-20161208-0213-20170112-1500.bin \
firmware-intel/ish/ish-lnlm-12128606-f9751b71.bin \
firmware-intel/ish/ish-lnlm-39ceeaf8.bin \
firmware-intel/ish/ish-lnlm-53c4ffad-90ef58cf.bin \
firmware-intel/ish/ish-lnlm-53c4ffad-a672a235.bin \
firmware-intel/ish/ish-lnlm-53c4ffad-cb391961.bin \
firmware-intel/ish/ish-lnlm-53c4ffad-ebb27e41.bin \
firmware-intel/ish/ish-lnlm.bin \
firmware-intel/ish/ish-ptl-39ceeaf8.bin \
firmware-intel/ish/ish-ptl-53c4ffad-75d6ebe2.bin \
firmware-intel/ish/ish-ptl-53c4ffad-bc3e29f7.bin \
firmware-intel/ish/ish-ptl.bin \
firmware-intel/ish/ish-wcl.bin \
firmware-intel/qat/qat-402xx-mmp.bin \
firmware-intel/qat/qat-402xx.bin \
firmware-intel/qat/qat-420xx-mmp.bin \
firmware-intel/qat/qat-420xx.bin \
firmware-intel/qat/qat-4xxx-mmp.bin \
firmware-intel/qat/qat-4xxx.bin \
firmware-intel/qat/qat-895xcc-mmp.bin \
firmware-intel/qat/qat-895xcc.bin \
firmware-intel/qat/qat-c3xxx-mmp.bin \
firmware-intel/qat/qat-c3xxx.bin \
firmware-intel/qat/qat-c62x-mmp.bin \
firmware-intel/qat/qat-c62x.bin \
firmware-intel/qat/qat-mmp.bin \
firmware-intel/vpu/vpu-37xx-v0.0.bin \
firmware-intel/vpu/vpu-37xx-v1.bin \
firmware-intel/vpu/vpu-40xx-v0.0.bin \
firmware-intel/vpu/vpu-40xx-v1.bin \
firmware-intel/vpu/vpu-50xx-v0.0.bin \
firmware-intel/vpu/vpu-50xx-v1.bin \
firmware-intel/vsc/ivsc-fw.bin \
firmware-intel/vsc/ivsc-pkg-hi556-0.bin \
firmware-intel/vsc/ivsc-pkg-himx11b1-0.bin \
firmware-intel/vsc/ivsc-pkg-himx2170-0.bin \
firmware-intel/vsc/ivsc-pkg-himx2172-0.bin \
firmware-intel/vsc/ivsc-pkg-int3537-0.bin \
firmware-intel/vsc/ivsc-pkg-ovti01a0-0.bin \
firmware-intel/vsc/ivsc-pkg-ovti01af-0.bin \
firmware-intel/vsc/ivsc-pkg-ovti01as-0.bin \
firmware-intel/vsc/ivsc-pkg-ovti02c1-0.bin \
firmware-intel/vsc/ivsc-pkg-ovti02e1-0.bin \
firmware-intel/vsc/ivsc-pkg-ovti2740-0.bin \
firmware-intel/vsc/ivsc-pkg-ovti5678-0.bin \
firmware-intel/vsc/ivsc-pkg-ovti9734-0.bin \
firmware-intel/vsc/ivsc-pkg-ovti9738-0.bin \
firmware-intel/vsc/ivsc-skucfg-hi556-0-1.bin \
firmware-intel/vsc/ivsc-skucfg-himx11b1-0-1.bin \
firmware-intel/vsc/ivsc-skucfg-himx2170-0-1.bin \
firmware-intel/vsc/ivsc-skucfg-himx2172-0-1.bin \
firmware-intel/vsc/ivsc-skucfg-int3537-0-1.bin \
firmware-intel/vsc/ivsc-skucfg-ovti01a0-0-1.bin \
firmware-intel/vsc/ivsc-skucfg-ovti01af-0-1.bin \
firmware-intel/vsc/ivsc-skucfg-ovti01as-0-1.bin \
firmware-intel/vsc/ivsc-skucfg-ovti02c1-0-1.bin \
firmware-intel/vsc/ivsc-skucfg-ovti02e1-0-1.bin \
firmware-intel/vsc/ivsc-skucfg-ovti2740-0-1.bin \
firmware-intel/vsc/ivsc-skucfg-ovti5678-0-1.bin \
firmware-intel/vsc/ivsc-skucfg-ovti9734-0-1.bin \
firmware-intel/vsc/ivsc-skucfg-ovti9738-0-1.bin \
firmware-isci/isci-firmware.bin \
firmware-qat-402xx-mmp.bin \
firmware-qat-402xx.bin \
firmware-qat-420xx-mmp.bin \
firmware-qat-420xx.bin \
firmware-qat-4xxx-mmp.bin \
firmware-qat-4xxx.bin \
firmware-qat-895xcc-mmp.bin \
firmware-qat-895xcc.bin \
firmware-qat-c3xxx-mmp.bin \
firmware-qat-c3xxx.bin \
firmware-qat-c62x-mmp.bin \
firmware-qat-c62x.bin \
firmware-qat-mmp.bin \
kernel-firmware-intel"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
dracut"

inherit rpm
