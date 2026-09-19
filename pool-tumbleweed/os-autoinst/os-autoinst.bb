SUMMARY = "OS-level test automation"
DESCRIPTION = "The OS-autoinst project aims at providing a means to run fully \
automated tests. Especially to run tests of basic and low-level \
operating system components such as bootloader, kernel, installer \
and upgrade, which can not easily and safely be tested with other \
automated testing frameworks. However, it can just as well be used \
to test firefox and openoffice operation on top of a newly \
installed OS."
LICENSE = "GPL-2.0-or-later"

PV = "5.1788768889.879c500"

RPM_NAME = "os-autoinst-5.1788768889.879c500-1.1.aarch64.rpm"
RPM_HASH = "9eb53d7dc88f06c2eb9ae7b38a250cb168eeddd4d901d0d84bd36de2a2a4f738671cb9c96d2f33d76b8edc5459b00cd2c8c919572217364ca21ede9bb5f3f4b6"

RPROVIDES:${PN} += "os-autoinst \
perl-OpenQA--Benchmark--Stopwatch \
perl-OpenQA--Commands \
perl-OpenQA--Exceptions \
perl-OpenQA--Isotovideo--Backend \
perl-OpenQA--Isotovideo--CommandHandler \
perl-OpenQA--Isotovideo--Dewebsockify \
perl-OpenQA--Isotovideo--Interface \
perl-OpenQA--Isotovideo--LLMAnalysis \
perl-OpenQA--Isotovideo--NeedleDownloader \
perl-OpenQA--Isotovideo--Runner \
perl-OpenQA--Isotovideo--Utils \
perl-OpenQA--NamedIOSelect \
perl-OpenQA--Qemu--BlockDev \
perl-OpenQA--Qemu--BlockDevConf \
perl-OpenQA--Qemu--ControllerConf \
perl-OpenQA--Qemu--DriveController \
perl-OpenQA--Qemu--DriveDevice \
perl-OpenQA--Qemu--DrivePath \
perl-OpenQA--Qemu--MutParams \
perl-OpenQA--Qemu--PFlashDevice \
perl-OpenQA--Qemu--Proc \
perl-OpenQA--Qemu--Snapshot \
perl-OpenQA--Qemu--SnapshotConf \
perl-OpenQA--Test--RunArgs \
perl-autotest \
perl-backend--baseclass \
perl-backend--console-proxy \
perl-backend--driver \
perl-backend--generalhw \
perl-backend--ipmi \
perl-backend--null \
perl-backend--pvm-hmc \
perl-backend--qemu \
perl-backend--s390x \
perl-backend--spvm \
perl-backend--svirt \
perl-backend--vagrant \
perl-backend--virt \
perl-basetest \
perl-bmwqemu \
perl-bmwqemu--tiedvars \
perl-commands \
perl-consoles--VMWare \
perl-consoles--VNC \
perl-consoles--console \
perl-consoles--ipmiSol \
perl-consoles--localXvnc \
perl-consoles--network-console \
perl-consoles--s3270 \
perl-consoles--serial-screen \
perl-consoles--ssh-screen \
perl-consoles--sshIucvconn \
perl-consoles--sshSerial \
perl-consoles--sshVirtsh \
perl-consoles--sshVirtshSUT \
perl-consoles--sshX3270 \
perl-consoles--sshXtermIPMI \
perl-consoles--sshXtermVt \
perl-consoles--ttyConsole \
perl-consoles--video-base \
perl-consoles--video-stream \
perl-consoles--virtio-terminal \
perl-consoles--vnc-base \
perl-cv \
perl-distribution \
perl-lockapi \
perl-log \
perl-mmapi \
perl-myjsonrpc \
perl-needle \
perl-ocr \
perl-osutils \
perl-signalblocker \
perl-testapi \
perl-tinycv \
perl-tinycv--Image"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/getent \
/usr/bin/perl \
/usr/sbin/useradd \
git-core \
iproute2 \
iputils \
jq \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libogg.so.0 \
libopencv-core.so.413 \
libopencv-highgui.so.413 \
libopencv-imgcodecs.so.413 \
libopencv-imgproc.so.413 \
libsndfile.so.1 \
libstdc++.so.6 \
libtheoradec.so.2 \
libtheoraenc.so.2 \
openssh-clients \
perl--MODULE-COMPAT-5.44.0 \
perl-B--Deparse \
perl-Carp \
perl-Carp--Always \
perl-Config \
perl-Cpanel--JSON--XS \
perl-Crypt--DES \
perl-Cwd \
perl-Data--Dumper \
perl-Digest--MD5 \
perl-DynaLoader \
perl-English \
perl-Errno \
perl-Exception--Class \
perl-Exporter \
perl-ExtUtils--testlib \
perl-Fcntl \
perl-Feature--Compat--Try \
perl-File--Basename \
perl-File--Find \
perl-File--Map \
perl-File--Path \
perl-File--Temp \
perl-File--Which \
perl-File--chdir \
perl-IO--Handle \
perl-IO--Scalar \
perl-IO--Select \
perl-IO--Socket \
perl-IO--Socket--INET \
perl-IO--Socket--UNIX \
perl-IPC--Open3 \
perl-IPC--Run--Debug \
perl-IPC--System--Simple \
perl-JSON--Validator \
perl-List--MoreUtils \
perl-List--Util \
perl-Mojo--IOLoop--ReadWriteProcess \
perl-Mojo--JSON \
perl-Mojo--Log \
perl-Mojo--URL \
perl-Mojo--UserAgent \
perl-Mojolicious \
perl-Mojolicious--Lite \
perl-Net--DBus \
perl-Net--Domain \
perl-Net--IP \
perl-Net--SNMP \
perl-Net--SSH2 \
perl-POSIX \
perl-Scalar--Util \
perl-Socket \
perl-Socket--MsgHdr \
perl-Term--ANSIColor \
perl-Thread--Queue \
perl-Time--HiRes \
perl-Time--Moment \
perl-Time--Seconds \
perl-XML--LibXML \
perl-XML--SemanticDiff \
perl-YAML--PP \
perl-YAML--XS \
perl-autodie \
perl-base \
perl-constant \
perl-integer \
perl-strict \
perl-version \
perl-warnings \
rsync \
sshpass \
virt-firmware"

inherit rpm
