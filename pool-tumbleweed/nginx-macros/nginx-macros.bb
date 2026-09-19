SUMMARY = "Just some macros to make packaging nginx and modules easier"
DESCRIPTION = "Just some macros to make packaging nginx and modules easier."
LICENSE = "BSD-2-Clause"

PV = "0.0.2"

RPM_NAME = "nginx-macros-0.0.2-1.2.noarch.rpm"
RPM_HASH = "d21d240725358255ee5f490ec23142fbe912ed80083f8d7f69466f4a42748f05130f9e17892ce2df3517bea4c67270ae03cdc3ccd7017c36de23bdb25ef59ff1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nginx-macros \
rpm-macro-ngx-access-log \
rpm-macro-ngx-conditionals \
rpm-macro-ngx-conf-dir \
rpm-macro-ngx-conf-path \
rpm-macro-ngx-configure \
rpm-macro-ngx-doc-dir \
rpm-macro-ngx-error-log \
rpm-macro-ngx-home \
rpm-macro-ngx-lock-path \
rpm-macro-ngx-log-dir \
rpm-macro-ngx-module-dir \
rpm-macro-ngx-pid-path \
rpm-macro-ngx-prefix \
rpm-macro-ngx-requires \
rpm-macro-ngx-sbin-path \
rpm-macro-ngx-tmp-fcgi \
rpm-macro-ngx-tmp-http \
rpm-macro-ngx-tmp-proxy \
rpm-macro-ngx-tmp-scgi \
rpm-macro-ngx-tmp-uwsgi \
rpm-macro-ngx-user-group"

RDEPENDS:${PN} += ""

inherit rpm
