SUMMARY = "Web-based management tool for Postfix virtual domains, mailboxes and aliases"
DESCRIPTION = "PostfixAdmin is a PHP based application that handles Postfix Style Virtual Domains and \
Users that are stored in MySQL or PostgreSQL. \
 \
Postfix Admin supports: \
- Virtual Mailboxes / Virtual Aliases / Forwarders \
- Alias domains (Domain to Domain forwarding with recipient validation) \
- Vacation (auto-response) for Virtual Mailboxes. \
- Quota / Alias & Mailbox limits per domain. \
- Fetchmail integration \
- Packaged with over 25 languages."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.15"

RPM_NAME = "postfixadmin-3.3.15-1.7.noarch.rpm"
RPM_HASH = "d0df2ef6a3ec914988f99ae5d7d47058cd8aa9f9001c6a5ab22d8e3cbee6a8cc5e350c841e1b5e618159b268527a473bb6576fb1f7a3a7116b1c1e0f03f3f84f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-postfixadmin \
group-vacation \
postfixadmin \
user-vacation"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/perl \
/usr/bin/sh \
/usr/sbin/sendmail \
group-www \
perl-DBI \
perl-Email--Sender--Simple \
perl-Email--Sender--Transport--SMTP \
perl-Email--Simple \
perl-Email--Simple--Creator \
perl-Email--Valid \
perl-Encode \
perl-Fcntl \
perl-File--Basename \
perl-File--Path \
perl-File--Temp \
perl-Getopt--Long \
perl-Getopt--Std \
perl-IO \
perl-IO--File \
perl-LockFile--Simple \
perl-Log--Log4perl \
perl-MIME--EncWords \
perl-POSIX \
perl-Sys--Syslog \
perl-Time--Local \
perl-Try--Tiny \
perl-strict \
php \
php-any-db \
php-mbstring \
php-phar \
php-spl \
shadow \
sysuser-shadow"

inherit rpm
