SUMMARY = "Quickly upload any raw disk images into your Hetzner Cloud projects"
DESCRIPTION = "Quickly upload any raw disk images into your Hetzner Cloud projects! \
 \
The Hetzner Cloud API does not support uploading disk images directly, and it \
only provides a limited set of default images. The only option for custom disk \
images that users have is by taking a 'snapshot' of an existing servers root \
disk. These can then be used to create new servers. \
 \
To create a completely custom disk image, users have to follow these steps: \
 \
* Create server with the correct server type \
* Enable rescue system for the server \
* Boot the server \
* Download the disk image from within the rescue system \
* Write disk image to servers root disk \
* Shut down the server \
* Take a snapshot of the servers root disk \
* Delete the server \
 \
This is an annoyingly long process. Many users have automated this with Packer \
& packer-plugin-hcloud before, but Packer offers a lot of additional complexity \
to wrap your head around. \
 \
This repository provides a simple CLI tool & Go library to do the above."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "hcloud-upload-image-1.5.0-1.3.aarch64.rpm"
RPM_HASH = "d368799bdf4ef7fc1b834909e3a3b424b6ff4f5e2b7f58d197e5bcc5115e65f756b6936b4fdf5b9442152574e682a03febd02c9fb15c8ab11c97de6ba3da0d00"

RPROVIDES:${PN} += "hcloud-upload-image"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
