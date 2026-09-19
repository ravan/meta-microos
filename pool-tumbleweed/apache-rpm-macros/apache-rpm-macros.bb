SUMMARY = "Apache RPM Macros"
DESCRIPTION = "RPM Macros intended for Apache modules spec files."
LICENSE = "Apache-2.0"

PV = "20201124"

RPM_NAME = "apache-rpm-macros-20201124-1.20.aarch64.rpm"
RPM_HASH = "1251b8a7c6e014af89d50da6e632aca3ac10b1c8563a601370602dbe7637ef040ddddadeccd3aa2c45cbbb149de850d9b31c907902aa2fec6608eba78b129e96"

RPROVIDES:${PN} += "apache-rpm-macros \
rpm-macro-apache-access-syntax-version \
rpm-macro-apache-apxs \
rpm-macro-apache-branch \
rpm-macro-apache-cflags \
rpm-macro-apache-datadir \
rpm-macro-apache-group \
rpm-macro-apache-includedir \
rpm-macro-apache-libexecdir \
rpm-macro-apache-localstatedir \
rpm-macro-apache-major \
rpm-macro-apache-mmn \
rpm-macro-apache-pname \
rpm-macro-apache-serverroot \
rpm-macro-apache-suse-maintenance-mmn \
rpm-macro-apache-sysconfdir \
rpm-macro-apache-user \
rpm-macro-apache-version"

RDEPENDS:${PN} += "apache-rpm-macros-control"

inherit rpm
