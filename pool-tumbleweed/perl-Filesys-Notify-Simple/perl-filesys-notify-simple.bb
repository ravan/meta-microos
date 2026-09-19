SUMMARY = "Simple and dumb file system watcher"
DESCRIPTION = "Filesys::Notify::Simple is a simple but unified interface to get \
notifications of changes to a given filesystem path. It utilizes inotify2 \
on Linux, fsevents on OS X, kqueue on FreeBSD and \
FindFirstChangeNotification on Windows if they're installed, with a \
fallback to the full directory scan if they're not available. \
 \
There are some limitations in this module. If you don't like it, use \
File::ChangeNotify. \
 \
  * There is no file name based filter. Do it in your own code. \
 \
  * You can not get types of events (created, updated, deleted). \
 \
  * Currently 'wait' method blocks. \
 \
In return, this module doesn't depend on any non-core modules. Platform \
specific optimizations with Linux::Inotify2, Mac::FSEvents, \
Filesys::Notify::KQueue and Win32::ChangeNotify are truely optional. \
 \
NOTE: Using Win32::ChangeNotify may put additional limitations. \
 \
  * Win32::ChangeNotify uses FindFirstChangeNotificationA so that Unicode \
characters can not be handled. On cygwin (1.7 or later), Unicode characters \
should be able to be handled when Win32::ChangeNotify is not used. \
 \
  * If more than 64 directories are included under the specified paths, an \
error occurrs."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.14"

RPM_NAME = "perl-Filesys-Notify-Simple-0.14-1.30.noarch.rpm"
RPM_HASH = "1a7871a84c2906bf833dbf6ba88625601340e8297015cfb1ff50c18dd77895fe340f625731cdd443b02aec52ae7b737e79fdf528917a091c945f9eb68776df7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Filesys--Notify--Simple \
perl-Filesys-Notify-Simple"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
