SUMMARY = "Nginx configuration for Pagure"
DESCRIPTION = "This package provides the configuration files for deploying \
a Pagure server using the Nginx web server."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.14.1"

RPM_NAME = "pagure-web-nginx-5.14.1-3.3.noarch.rpm"
RPM_HASH = "23811b6597e418b0188b6b0b120cb46c97915d87a006448e2d4027708ff413090ef12980834670a014c30851926c0f11cbad2664b94769efadf6dadc57cb00f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-pagure-web-nginx \
pagure-web-nginx"

RDEPENDS:${PN} += "/usr/bin/sh \
nginx \
pagure \
python3-gunicorn"

inherit rpm
