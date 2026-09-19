SUMMARY = "An OBS source service: download files"
DESCRIPTION = "This is a source service for openSUSE Build Service. \
 \
This service is parsing all spec files and downloads all Source files which are specified via a http, https or ftp url."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.2"

RPM_NAME = "obs-service-download_files-0.9.2-2.3.noarch.rpm"
RPM_HASH = "78fc39f1d639c67d8580dca998d55a8414235b8d4e16d9a2f5075ded086e677cd41550cb145377f2cae2af0822d8e62ed1713cf6acfd62ebb179dd06380c1f83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-obs-service-download-files \
obs-service-download-files"

RDEPENDS:${PN} += "/usr/bin/bash \
build \
curl \
diffutils \
perl-YAML--XS"

inherit rpm
