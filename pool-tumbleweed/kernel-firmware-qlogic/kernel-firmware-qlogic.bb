SUMMARY = "Kernel firmware files for QLogic network drivers"
DESCRIPTION = "This package contains kernel firmware files for QLogic network drivers."
LICENSE = "GPL-2.0-or-later & SUSE-Firmware & GPL-2.0-only"

PV = "20260731"

RPM_NAME = "kernel-firmware-qlogic-20260731-1.1.noarch.rpm"
RPM_HASH = "b4a635bd000fac9aac622737588e47315537d8f312c9c097a436a6c01f9969c98f5bb59855e2dcb9c4e4f0744f9df7d33c98ebbe89598568a52fb09361117cb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-cbfw-3.2.5.1.bin \
firmware-ct2fw-3.2.5.1.bin \
firmware-ctfw-3.2.5.1.bin \
firmware-qed/qed-init-values-8.10.9.0.bin \
firmware-qed/qed-init-values-8.14.6.0.bin \
firmware-qed/qed-init-values-8.18.9.0.bin \
firmware-qed/qed-init-values-8.20.0.0.bin \
firmware-qed/qed-init-values-8.30.12.0.bin \
firmware-qed/qed-init-values-8.33.12.0.bin \
firmware-qed/qed-init-values-8.37.7.0.bin \
firmware-qed/qed-init-values-8.40.33.0.bin \
firmware-qed/qed-init-values-zipped-8.10.10.0.bin \
firmware-qed/qed-init-values-zipped-8.10.5.0.bin \
firmware-qed/qed-init-values-zipped-8.15.3.0.bin \
firmware-qed/qed-init-values-zipped-8.20.0.0.bin \
firmware-qed/qed-init-values-zipped-8.33.1.0.bin \
firmware-qed/qed-init-values-zipped-8.33.11.0.bin \
firmware-qed/qed-init-values-zipped-8.37.2.0.bin \
firmware-qed/qed-init-values-zipped-8.37.7.0.bin \
firmware-qed/qed-init-values-zipped-8.4.2.0.bin \
firmware-qed/qed-init-values-zipped-8.42.2.0.bin \
firmware-qed/qed-init-values-zipped-8.59.1.0.bin \
firmware-qed/qed-init-values-zipped-8.7.3.0.bin \
firmware-ql2100-fw.bin \
firmware-ql2200-fw.bin \
firmware-ql2300-fw.bin \
firmware-ql2322-fw.bin \
firmware-ql2400-fw.bin \
firmware-ql2500-fw.bin \
firmware-ql2600-fw.bin \
firmware-ql2700-fw.bin \
firmware-ql2900-fw.bin \
firmware-ql8300-fw.bin \
firmware-qlogic/1040.bin \
firmware-qlogic/12160.bin \
firmware-qlogic/1280.bin \
firmware-qlogic/sd7220.fw \
kernel-firmware-qlogic \
qlogic-firmware"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
dracut"

inherit rpm
