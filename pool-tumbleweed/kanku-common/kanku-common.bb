SUMMARY = "Common files for kanku"
DESCRIPTION = "common config and lib files used in kanku"
LICENSE = "GPL-3.0-only"

PV = "1.0.0"

RPM_NAME = "kanku-common-1.0.0-2.2.noarch.rpm"
RPM_HASH = "dc09581230a4104d85bff7af10193b0aa5bd3b702e9e09bf87248c890077554c73a56a49f755c459c933af67a9ae062c911f114b3b35d083a4434fa7ff3eff1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-kanku-common \
kanku-common \
perl-Kanku--Airbrake \
perl-Kanku--Airbrake--Dummy \
perl-Kanku--Config \
perl-Kanku--Config--Defaults \
perl-Kanku--Dispatch--Local \
perl-Kanku--File \
perl-Kanku--GPG \
perl-Kanku--Handler--ChangeDomainState \
perl-Kanku--Handler--CleanupIPTables \
perl-Kanku--Handler--CopyProfile \
perl-Kanku--Handler--CreateDomain \
perl-Kanku--Handler--DomainSnapshot \
perl-Kanku--Handler--ExecuteCommandOnHost \
perl-Kanku--Handler--ExecuteCommandViaConsole \
perl-Kanku--Handler--ExecuteCommandViaSSH \
perl-Kanku--Handler--GIT \
perl-Kanku--Handler--HTTPDownload \
perl-Kanku--Handler--ImageDownload \
perl-Kanku--Handler--K8NodePortForward \
perl-Kanku--Handler--OBSCheck \
perl-Kanku--Handler--OBSServerFrontendTests \
perl-Kanku--Handler--PortForward \
perl-Kanku--Handler--PrepareSSH \
perl-Kanku--Handler--Reboot \
perl-Kanku--Handler--RemoveDomain \
perl-Kanku--Handler--ResizeImage \
perl-Kanku--Handler--RevertQcow2Snapshot \
perl-Kanku--Handler--SaltSSH \
perl-Kanku--Handler--SetJobContext \
perl-Kanku--Handler--SetupNetwork \
perl-Kanku--Handler--Vagrant \
perl-Kanku--Handler--Wait \
perl-Kanku--Handler--WaitForSystemd \
perl-Kanku--Helpers \
perl-Kanku--Job \
perl-Kanku--JobList \
perl-Kanku--LibVirt--HostList \
perl-Kanku--Logger \
perl-Kanku--Notifier--Console \
perl-Kanku--Notifier--NSCA \
perl-Kanku--Notifier--NSCAng \
perl-Kanku--Notifier--Sendmail \
perl-Kanku--NotifyQueue \
perl-Kanku--NotifyQueue--Dummy \
perl-Kanku--NotifyQueue--RabbitMQ \
perl-Kanku--RabbitMQ \
perl-Kanku--Roles--Config \
perl-Kanku--Roles--Config--Base \
perl-Kanku--Roles--Config--KankuFile \
perl-Kanku--Roles--DB \
perl-Kanku--Roles--Daemon \
perl-Kanku--Roles--Dispatcher \
perl-Kanku--Roles--Handler \
perl-Kanku--Roles--Logger \
perl-Kanku--Roles--ModLoader \
perl-Kanku--Roles--Notifier \
perl-Kanku--Roles--NotifyQueue \
perl-Kanku--Roles--REST \
perl-Kanku--Roles--SSH \
perl-Kanku--Roles--Serialize \
perl-Kanku--Schema \
perl-Kanku--Schema--Result--ImageDownloadHistory \
perl-Kanku--Schema--Result--JobGroup \
perl-Kanku--Schema--Result--JobHistory \
perl-Kanku--Schema--Result--JobHistoryComment \
perl-Kanku--Schema--Result--JobHistorySub \
perl-Kanku--Schema--Result--JobWaitFor \
perl-Kanku--Schema--Result--ObsCheckHistory \
perl-Kanku--Schema--Result--Role \
perl-Kanku--Schema--Result--RoleRequest \
perl-Kanku--Schema--Result--StateWorker \
perl-Kanku--Schema--Result--User \
perl-Kanku--Schema--Result--UserRole \
perl-Kanku--Schema--Result--WsSession \
perl-Kanku--Schema--Result--WsToken \
perl-Kanku--Setup--Devel \
perl-Kanku--Setup--LibVirt--Network \
perl-Kanku--Setup--Roles--Common \
perl-Kanku--Setup--Roles--Server \
perl-Kanku--Setup--Server--Distributed \
perl-Kanku--Setup--Server--Standalone \
perl-Kanku--Setup--Worker \
perl-Kanku--Task \
perl-Kanku--Task--Local \
perl-Kanku--Task--Remote \
perl-Kanku--Task--RemoteAll \
perl-Kanku--Test--RabbitMQ \
perl-Kanku--TypeConstraints \
perl-Kanku--Util \
perl-Kanku--Util--CurlHttpDownload \
perl-Kanku--Util--DoD \
perl-Kanku--Util--IPTables \
perl-Kanku--Util--VM \
perl-Kanku--Util--VM--Console \
perl-Kanku--Util--VM--Image \
perl-Kanku--WebSocket--Notification \
perl-Kanku--WebSocket--Session \
perl-Kanku--YAML"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/perl \
bsdtar \
libvirt-daemon-config-network \
libvirt-daemon-config-nwfilter \
libvirt-daemon-qemu \
openssl-cli \
perl-Archive--Cpio \
perl-Config--Tiny \
perl-Const--Fast \
perl-DBD-SQLite \
perl-DBIx--Class \
perl-DBIx--Class--Fixtures \
perl-DBIx--Class--Migration \
perl-Dancer2 \
perl-Dancer2--Plugin--Auth--Extensible \
perl-Dancer2--Plugin--Auth--Extensible--Provider--DBIC \
perl-Dancer2--Plugin--DBIC \
perl-Dancer2--Plugin--REST \
perl-Expect \
perl-File--LibMagic \
perl-IO--Uncompress--UnXz \
perl-IPC--Run \
perl-JSON--XS \
perl-LWP--Protocol--https \
perl-Libssh--Session \
perl-Log--Log4perl \
perl-Mail--Sendmail \
perl-Moose \
perl-MooseX--App \
perl-MooseX--ClassAttribute \
perl-MooseX--Singleton \
perl-Net--IP \
perl-Net--OBS--Client \
perl-Path--Tiny \
perl-Plack \
perl-Sys--Virt \
perl-Template \
perl-Template--Plugin--Filter--ANSIColor \
perl-Term--ReadKey \
perl-Test--Simple \
perl-UUID \
perl-User--pwent \
perl-XML--Structured \
perl-XML--XPath \
perl-YAML--PP \
procps \
sudo \
tar"

inherit rpm
