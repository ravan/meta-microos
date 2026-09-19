SUMMARY = "Kernel firmware files for various platform drivers"
DESCRIPTION = "This package contains kernel firmware files for various platform drivers."
LICENSE = "GPL-2.0-or-later & SUSE-Firmware & GPL-2.0-only & MPL-1.0 & GPL-3.0-only & MIT"

PV = "20260717"

RPM_NAME = "kernel-firmware-platform-20260717-1.1.noarch.rpm"
RPM_HASH = "e0e48b2d80ac6284cbdefdbbd4002f9cc9e1c5831ebbdc5fa85f9e97fd457d65c1f7b17b76b819757a91b6bc563ce87ea1672b9b04d3cc8eb6a4a67dc4266001"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-Lontium/lt7911exc-fw.bin \
firmware-Lontium/lt8713sx-fw.bin \
firmware-Lontium/lt9611c-fw.bin \
firmware-Lontium/lt9611uxc-fw.bin \
firmware-advansys/3550.bin \
firmware-advansys/38C0800.bin \
firmware-advansys/38C1600.bin \
firmware-advansys/mcode.bin \
firmware-amd/amd-sev-fam17h-model0xh.sbin \
firmware-amd/amd-sev-fam17h-model3xh.sbin \
firmware-amd/amd-sev-fam19h-model0xh.sbin \
firmware-amd/amd-sev-fam19h-model1xh.sbin \
firmware-amd/amd-sev-fam19h-modelaxh.sbin \
firmware-amd/amd-sev-fam1ah-model0xh.sbin \
firmware-amdnpu/1502-00/npu-7.sbin \
firmware-amdnpu/1502-00/npu.sbin \
firmware-amdnpu/1502-00/npu.sbin.1.5.2.380 \
firmware-amdnpu/1502-00/npu.sbin.1.5.5.391 \
firmware-amdnpu/17f0-10/npu-7.sbin \
firmware-amdnpu/17f0-10/npu.sbin \
firmware-amdnpu/17f0-10/npu.sbin.1.0.0.63 \
firmware-amdnpu/17f0-10/npu.sbin.1.1.2.64 \
firmware-amdnpu/17f0-11/npu-7.sbin \
firmware-amdnpu/17f0-11/npu.sbin \
firmware-amdnpu/17f0-11/npu.sbin.1.0.0.166 \
firmware-amdnpu/17f0-11/npu.sbin.1.1.2.65 \
firmware-amdtee/773bd96f-b83f-4d52-b12dc529b13d8543.bin \
firmware-amdtee/amd-pmf-v3-1.bin \
firmware-amdtee/amd-pmf-v3.bin \
firmware-amdtee/f29bb3d9-bd66-5441-afb88acc2b2b60d6.bin \
firmware-amphion/vpu/vpu-fw-imx8-dec.bin \
firmware-amphion/vpu/vpu-fw-imx8-enc.bin \
firmware-arm/mali/arch10.10/mali-csffw.bin \
firmware-arm/mali/arch10.12/mali-csffw.bin \
firmware-arm/mali/arch10.8/mali-csffw.bin \
firmware-arm/mali/arch11.8/mali-csffw.bin \
firmware-arm/mali/arch12.8/mali-csffw.bin \
firmware-arm/mali/arch13.8/mali-csffw.bin \
firmware-ast-dp501-fw.bin \
firmware-bmi260-init-data.fw \
firmware-cadence/mhdp8546.bin \
firmware-cavium/cnn55xx-ae.fw \
firmware-cavium/cnn55xx-se.fw \
firmware-cis/3CCFEM556.cis \
firmware-cis/3CXEM556.cis \
firmware-cis/COMpad2.cis \
firmware-cis/COMpad4.cis \
firmware-cis/DP83903.cis \
firmware-cis/LA-PCM.cis \
firmware-cis/MT5634ZLX.cis \
firmware-cis/NE2K.cis \
firmware-cis/PCMLM28.cis \
firmware-cis/PE-200.cis \
firmware-cis/PE520.cis \
firmware-cis/RS-COM-2P.cis \
firmware-cis/SW-555-SER.cis \
firmware-cis/SW-7xx-SER.cis \
firmware-cis/SW-8xx-SER.cis \
firmware-cis/tamarack.cis \
firmware-cnm/wave521c-k3-codec-fw.bin \
firmware-cnm/wave633c-imx9-codec-fw.bin \
firmware-dsp56k/bootstrap.bin \
firmware-ene-ub6250/ms-init.bin \
firmware-ene-ub6250/ms-rdwr.bin \
firmware-ene-ub6250/msp-rdwr.bin \
firmware-ene-ub6250/sd-init1.bin \
firmware-ene-ub6250/sd-init2.bin \
firmware-ene-ub6250/sd-rdwr.bin \
firmware-f2255usb.bin \
firmware-go7007/go7007fw.bin \
firmware-go7007/go7007tv.bin \
firmware-go7007/lr192.fw \
firmware-go7007/px-m402u.fw \
firmware-go7007/px-tv402u.fw \
firmware-go7007/s2250-1.fw \
firmware-go7007/s2250-2.fw \
firmware-go7007/wis-startrek.fw \
firmware-imx/sdma/sdma-imx6q.bin \
firmware-imx/sdma/sdma-imx7d.bin \
firmware-inside-secure/eip197-minifw/ifpp.bin \
firmware-inside-secure/eip197-minifw/ipue.bin \
firmware-ixp4xx/NPE-A \
firmware-ixp4xx/NPE-A-HSS \
firmware-ixp4xx/NPE-B \
firmware-ixp4xx/NPE-C \
firmware-lt8713sx-fw.bin \
firmware-lt9611uxc-fw.bin \
firmware-matrox/g200-warp.fw \
firmware-matrox/g400-warp.fw \
firmware-microchip/mscc-vsc8574-revb-int8051-29e8.bin \
firmware-microchip/mscc-vsc8584-revb-int8051-fb48.bin \
firmware-mrvl/cpt01/ae.out \
firmware-mrvl/cpt01/ie.out \
firmware-mrvl/cpt01/se.out \
firmware-mrvl/cpt02/ae.out \
firmware-mrvl/cpt02/ie.out \
firmware-mrvl/cpt02/se.out \
firmware-mrvl/cpt03/ae.out \
firmware-mrvl/cpt03/ie.out \
firmware-mrvl/cpt03/se.out \
firmware-mrvl/cpt04/ae.out \
firmware-mrvl/cpt04/ie.out \
firmware-mrvl/cpt04/se.out \
firmware-nxp/helper-uart-3000000.bin \
firmware-nxp/sd-w61x-v1.bin.se \
firmware-nxp/sr150-fw.bin \
firmware-nxp/uartiw416-bt-v0.bin \
firmware-nxp/uartspi-n61x-v1.bin.se \
firmware-nxp/uartuart8987-bt.bin \
firmware-nxp/uartuart8997-bt-v4.bin \
firmware-nxp/uartuart9098-bt-v1.bin \
firmware-ositech/Xilinx7OD.bin \
firmware-powervr/rogue-33.15.11.3-v1.fw \
firmware-powervr/rogue-36.52.104.182-v1.fw \
firmware-powervr/rogue-36.53.104.796-v1.fw \
firmware-r128/r128-cce.bin \
firmware-r8a779x-usb3-v1.dlmem \
firmware-r8a779x-usb3-v2.dlmem \
firmware-r8a779x-usb3-v3.dlmem \
firmware-rcar-gen4-pcie.bin \
firmware-rockchip/dptx.bin \
firmware-s2250-loader.fw \
firmware-s2250.fw \
firmware-tsse-firmware.bin \
firmware-usbdux-firmware.bin \
firmware-usbduxfast-firmware.bin \
firmware-usbduxsigma-firmware.bin \
firmware-wfx/brd4001a.pds \
firmware-wfx/brd8022a.pds \
firmware-wfx/brd8023a.pds \
firmware-wfx/wfm-wf200-C0.sec \
kernel-firmware-platform"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
dracut"

inherit rpm
